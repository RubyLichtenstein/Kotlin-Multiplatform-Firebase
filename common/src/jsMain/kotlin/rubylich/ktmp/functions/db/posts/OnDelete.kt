package rubylich.ktmp.functions.db.posts

import rubylich.ktmp.features.posts.REF_POSTS
import functions
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.asPromise
import kotlinx.coroutines.async

const val PARAM_USER_ID = "userId";

//user approved
fun dbPostsOnDelete(): dynamic = functions.firestore
    .document("/$REF_POSTS/{id}")
    .onDelete { snapshot, context ->
        GlobalScope.async {
//            val userId = context.params.userId as String
//            val userRepo = UserRepo()
//            val user = userRepo.get(userId)
//
//            user.groups.forEach{ id ->
//                val group = getGroup(id)
//                if (group != null) {
//                    addMemberToGroup(userId, id)
//                    notifyGroupAboutNewMember(group, id, userId)
//                } else {
//                    createUnExistGroup(id, userId)
//                }
//            }
//
//            approveUser(userId)
//            sendUserApprovedNotification(user)
        }.asPromise()
    }

//suspend fun notifyGroupAboutNewMember(
//    group: Group,
//    groupId: String,
//    userId: String
//) {
//    return sendDataNotificationToTopic(
//        topic = groupTopic(groupId),
//        payload = GroupNotification.NewMember(
//            id = NotificationId.new_connection_notif,
//            title = new_group_member,
//            body = group.name,
//            click_action = Notifications.CLICK_ACTION_OPEN_GROUP_MEMBERS,
//            tag = group.name,
//            groupName = group.name,
//            memberId = userId,
//            groupId = groupId
//        )
//    ).await()
//}
//



