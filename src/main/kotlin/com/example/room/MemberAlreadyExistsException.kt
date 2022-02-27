package com.example.room

class MemberAlreadyExistsException: Exception(
    "There is already a user with that  username in the room"
)