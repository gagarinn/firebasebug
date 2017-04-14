/**
 * Copyright 2016 Google Inc. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package it.clipcall.qa;

import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;


public class MyFirebaseInstanceIDService extends FirebaseInstanceIdService {

    private static final String TAG = "MyFirebaseIIDService";

    /**
     * Called if InstanceID token is updated. This may occur if the security of
     * the previous token had been compromised. Note that this is called when the InstanceID token
     * is initially generated so this is where you would retrieve the token.
     */
    // [START refresh_token]
    @Override
    public void onTokenRefresh() {
        // Get updated InstanceID token.
        String refreshedToken = FirebaseInstanceId.getInstance().getToken();
        Log.d(TAG, "Refreshed token: " + refreshedToken);

        // If you want to send messages to this application instance or
        // manage this apps subscriptions on the server side, send the
        // Instance ID token to your app server.
        sendRegistrationToServer(refreshedToken);
    }
    // [END refresh_token]

    /**
     * Persist token to third-party servers.
     *
     * Modify this method to associate the user's FCM InstanceID token with any server-side account
     * maintained by your application.
     *
     * @param token The new token.
     */
    private void sendRegistrationToServer(String token) {
        // TODO: Implement this method to send token to your app server.
    }

//    03/31/2017 04:54:32pmPush: Failed to send push notification to d7a39675-3c9b-419c-8a62-d7696fe9a8c4. No tokens found.
//03/31/2017 04:54:33pmPush: Failed to send gcm push notification to 5c0c5fe3-3e3e-4f4f-8432-e8443d82a84a. Missing gcm credentials.
//    Hi! Thanks for the quick response.
//CreateConversation sender id =  d7a39675-3c9b-419c-8a62-d7696fe9a8c4 ,  receiver id = 32e953e3-8422-4997-bdd7-56dacf9f9520 ,  conversationId = b347181a-7594-4db2-9c24-9a6c8d44befa

//    error: @Scope annotations are not allowed on @Inject constructors. Annotate the class instead.
//    error: it.clipcall.infrastructure.RandomNumberGenerator cannot be provided without an @Inject constructor or from an @Provides-annotated method.
//    error: dagger.internal.codegen.ComponentProcessor was unable to process this class because not all of its dependencies could be resolved. Check for compilation errors or a circular dependency with generated code.
}
