package vc.mosh.inappupdate.service

import org.springframework.stereotype.Service
import vc.mosh.inappupdate.datasource.AppInfoDataSource
import vc.mosh.inappupdate.model.AppInfo

@Service
class AppInfoService(private val appInfoDataSource: AppInfoDataSource) {

    fun getAppInfo(): AppInfo = appInfoDataSource.getAppInfo()
}