package com.example.courseregistration.domain.user.service

import com.example.courseregistration.domain.user.dto.SignUpRequest
import com.example.courseregistration.domain.user.dto.UpdateUserProfileRequest
import com.example.courseregistration.domain.user.dto.UserResponse

interface UserService {

    fun signUp(signUpRequest: SignUpRequest): UserResponse

    fun updateUserProfile(userId: Long, updateUserProfileRequest: UpdateUserProfileRequest): UserResponse
}