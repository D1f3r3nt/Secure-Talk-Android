package com.diferent.securetalk.model.enums

sealed class RootState 

class Loading: RootState()

class Authorized: RootState()

class NonAuthorized: RootState()