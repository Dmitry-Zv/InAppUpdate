package vc.mosh.inappupdate.datasource

import vc.mosh.inappupdate.model.AppInfo

interface AppInfoDataSource {

    fun getAppInfo(): AppInfo
}