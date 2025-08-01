package otus.gpb.recyclerview.data

data class GroupChat(
    val id: Int,
    val groupName: String,
    val lastUsername: String,
    val lastMessage: String,
    val avatarUrl: String,
    val lastUserUrl: String,
    var isVerified: Boolean,
    var isMuted: Boolean,
    var isRead: Boolean,
    var isVoip: Boolean,
    var counterMessages: Int,
    var isMentioned: Boolean,
    val messageTime: String
)


val groupChats = listOf(
    GroupChat(
        id = 1,
        groupName = "Labubu fans",
        lastUsername = "Teodor",
        lastMessage = "Hi, how are you?",
        avatarUrl = "https://media.geeksforgeeks.org/wp-content/uploads/20210101144014/gfglogo.png",
        lastUserUrl = "https://upload.wikimedia.org/wikipedia/commons/thumb/9/95/Moscow_%288351271825%29.jpg/500px-Moscow_%288351271825%29.jpg",
        isVerified = false,
        isMuted = false,
        isRead = true,
        isVoip = false,
        counterMessages = 0,
        isMentioned = false,
        messageTime = "06.07.2025 10:00",
    ),
    GroupChat(
        id = 2,
        groupName = "Top Gear",
        lastUsername = "Patrick",
        lastMessage = "Yes, I know this, but what you want to do?",
        avatarUrl = "https://media.geeksforgeeks.org/wp-content/uploads/20210101144014/gfglogo.png",
        lastUserUrl = "https://upload.wikimedia.org/wikipedia/commons/thumb/9/95/Moscow_%288351271825%29.jpg/500px-Moscow_%288351271825%29.jpg",
        isVerified = false,
        isMuted = false,
        isRead = true,
        isVoip = false,
        counterMessages = 0,
        isMentioned = false,
        messageTime = "10.06.2025 15:23",
    ),
    GroupChat(
        id = 3,
        groupName = "Karena Makarena",
        lastUsername = "Tereza",
        lastMessage = "Whaaaaaaat??",
        avatarUrl = "https://i.imgur.com/DvpvklR.png",
        lastUserUrl = "https://upload.wikimedia.org/wikipedia/commons/thumb/9/95/Moscow_%288351271825%29.jpg/500px-Moscow_%288351271825%29.jpg",
        isVerified = false,
        isMuted = false,
        isRead = false,
        isVoip = true,
        counterMessages = 3,
        isMentioned = false,
        messageTime = "06.07.2025 10:00",
    ),
    GroupChat(
        id = 4,
        groupName = "Eric Davidich",
        lastUsername = "Magomed",
        lastMessage = "Shaize",
        avatarUrl = "https://i.imgur.com/DvpvklR.png",
        lastUserUrl = "https://upload.wikimedia.org/wikipedia/commons/thumb/9/95/Moscow_%288351271825%29.jpg/500px-Moscow_%288351271825%29.jpg",
        isVerified = false,
        isMuted = true,
        isRead = false,
        isVoip = false,
        counterMessages = 69,
        isMentioned = true,
        messageTime = "05.07.2025 17:56",
    ),
)