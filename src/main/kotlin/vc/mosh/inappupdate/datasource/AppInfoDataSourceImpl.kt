package vc.mosh.inappupdate.datasource

import org.springframework.stereotype.Repository
import vc.mosh.inappupdate.model.AppInfo

@Repository
class AppInfoDataSourceImpl : AppInfoDataSource {
    override fun getAppInfo(): AppInfo = AppInfo.testAppInfo
}