package ru.netology

fun main() {
    val post1 = Post(
        id = 0,
        ownerID = 1,
        fromID = 2,
        createdBy = 3,
        date = 29032022,
        text = "Очень нудное ДЗ",
        replyOwnerID = 4,
        replyPostID = 5,
        friendsOnly = true,
        comments = null,
        copyright = null,
        likes = null,
        reposts = null,
        views = null,
        postType = "post",
        postSource = null,
        geo = null,
        attachments = null,
        singerID = 10,
        copyHistory = null,
        canPin = true,
        canDelete = false,
        canEdit = true,
        isPinned = true,
        markedAsAds = false,
        isFavorite = true,
        donut = null,
        postponedID = 12
    )

    println(WallService.add(post1))

    val attach = Attachment.FileAttachment("file", File (111, "Документ", 222, 540, "ext", "url", 6042022, 0))

}
