package ru.netology.coroutines.attachments

data class Attachment(
    val url: String,
    val description: String,
    val type: AttachmentType,
)