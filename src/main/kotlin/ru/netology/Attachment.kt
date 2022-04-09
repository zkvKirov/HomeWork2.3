package ru.netology

sealed class Attachment {

    data class AudioAttachment (
        override val type: String = "audio",
        val audio: Audio = Audio(234, 56756, "Кино", "Группа крови", 85,
            "url", 345, 678, 1991)
    ) : Attachment()

    data class VideoAttachment (
        override val type: String = "video",
        val video: Video = Video(123, 456, "Война", "Кино про войну", 90, null,
            1998, 6042022, 55, 0, false, true, 720, 436)
    ) : Attachment()

    data class PhotoAttachment (
        override val type: String = "photo",
        val photo: Photo = Photo(222, 333, "Nature", 444,
            "какой-то текст", 6042022, null, 400, 300)
    ) : Attachment ()

    data class GraffitiAttachment (
        override val type: String = "graffiti",
        val graffiti: Graffiti = Graffiti(777, 999, "url", 720, 540)
    ) : Attachment ()

    data class FileAttachment (
        override val type: String = "file",
        val file: File = File (111, "Документ", 222, 540, "ext", "url", 6042022, 0)
    ) : Attachment ()

    abstract val type: String
}