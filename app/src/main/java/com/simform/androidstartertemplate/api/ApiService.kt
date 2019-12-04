/**
 * Copyright 2019 AndroidStarterTemplate
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.simform.androidstartertemplate.api

import com.simform.androidstartertemplate.api.request.LoginRequest
import com.simform.androidstartertemplate.api.response.LoginResponse
import retrofit2.http.Body
import retrofit2.http.POST

// API service
interface ApiService {
    //TODO: your apis goes here
    /**
     * User Login api service
     * @param loginSignUpRequest LoginSignUpRequest
     * @return Deferred<Response<LoginResponse>>
     *     */
    @POST("user/login")
    suspend fun userLogin(@Body loginSignUpRequest: LoginRequest): LoginResponse

}