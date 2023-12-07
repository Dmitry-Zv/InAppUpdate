package vc.mosh.inappupdate.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import vc.mosh.inappupdate.model.AppInfo
import vc.mosh.inappupdate.service.AppInfoService

@RestController
@RequestMapping("api/app_info")
class AppInfoController(private val service: AppInfoService) {

    @GetMapping
    fun getAppInfo(): AppInfo = service.getAppInfo()
}