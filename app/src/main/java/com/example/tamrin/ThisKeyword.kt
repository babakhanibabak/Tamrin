package com.example.tamrin

import androidx.core.app.NotificationCompat.MessagingStyle.Message

class postItNote {
    var message="no message"
    fun updateMessage(message: String){
        this.message=message
    }
}
fun main(){
    val postIt=postItNote()
    println(postIt.message)
    postIt.updateMessage("meet at 5")
    println(postIt.message)
}