package ru.netology

sealed class Attachment {

    abstract val type: String

    data class AudioAttachment (
        override val type: String = "audio",
        val audio: Audio
    ) : Attachment()

    data class VideoAttachment (
        override val type: String = "video",
        val video: Video
    ) : Attachment()

    data class PhotoAttachment (
        override val type: String = "photo",
        val photo: Photo
    ) : Attachment ()

    data class GraffitiAttachment (
        override val type: String = "graffiti",
        val graffiti: Graffiti
    ) : Attachment ()

    data class FileAttachment (
        override val type: String = "file",
        val file: File
    ) : Attachment ()
}