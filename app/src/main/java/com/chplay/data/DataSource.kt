package com.chplay.data

import com.chplay.model.App

class DataSource {
    fun loadSocialApp(): List<App> {
        return listOf(
            App("Facebook", 0, 4.6f, false),
            App("Instagram", 0, 4.7f, false),
            App("Twitter", 0, 4.5f, false),
            App("Youtube", 0, 4.8f, false),
            App("Tiktok", 0, 4.4f, false),
            App("Snapchat", 0, 4.3f, false),
        )
    }

    fun loadProductivityApp(): List<App> {
        return listOf(
            App("Google Drive", 0, 4.6f, false),
            App("Microsoft Word", 0, 4.7f, false),
            App("Microsoft Excel", 0, 4.5f, false),
            App("Microsoft PowerPoint", 0, 4.8f, false),
            App("Microsoft OneNote", 0, 4.4f, false),
            App("Microsoft Outlook", 0, 4.3f, false),
            App("Microsoft OneDrive", 0, 4.2f, false),
        )
    }

    fun loadPopularApp(): List<App> {
        return listOf(
            App("Tiktok", 0, 4.4f, false),
            App("Facebook", 0, 4.6f, false),
            App("Youtube", 0, 4.8f, false),
            App("Instagram", 0, 4.7f, false),
            App("Twitter", 0, 4.5f, false),
        )
    }

    fun loadGame(): List<App> {
        return listOf(
            App("PUBG Mobile", 0, 4.4f, false),
            App("Mobile Legends", 0, 4.6f, false),
            App("Free Fire", 0, 4.8f, false),
            App("Call of Duty", 0, 4.7f, false),
            App("Clash of Clans", 0, 4.5f, false),
        )
    }
}