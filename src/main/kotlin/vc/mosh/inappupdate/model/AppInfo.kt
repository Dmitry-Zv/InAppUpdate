package vc.mosh.inappupdate.model

data class AppInfo(
    val latestVersion: String,
    val latestVersionCode: Int?,
    val url: String,
    val releaseNotes: List<String>?
) {
    companion object {
        val testAppInfo = AppInfo(
            latestVersion = "1.2.2",
            latestVersionCode = 10,
            url = "121.0.0.1:8080/C://Users/VC/Downloads/cat.png",
            releaseNotes = listOf(
                "init",
                "first update",
                "fix bugs"
            )
        )
    }
}
