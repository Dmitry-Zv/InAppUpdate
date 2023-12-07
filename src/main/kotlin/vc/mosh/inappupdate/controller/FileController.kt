package vc.mosh.inappupdate.controller

import org.springframework.core.io.ClassPathResource
import org.springframework.core.io.Resource
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.RestController
import java.nio.file.Files

@RestController
@RequestMapping("api/download/app-debug")
class FileController() {

    @GetMapping
    @ResponseBody
    fun downloadApk():ResponseEntity<ByteArray>{
        val resource: Resource = ClassPathResource("static/app-debug.apk")
        val bytes: ByteArray = Files.readAllBytes(resource.file.toPath())

        return ResponseEntity.ok()
            .contentType(MediaType.parseMediaType("application/vnd.android.package-archive"))
            .body(bytes)
    }
}