package ru.netology.coroutines.dto

data class PostWithAllInformation (
    val author: Author,
    val post: Post,
    val comments: List<CommentWithAuthor>,
)
