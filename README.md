# issue 4759
### Issue link
- https://github.com/firebase/firebase-android-sdk/issues/4759
### Summary
- `_app_start` event is not being reported when initializing FIrebaseApp manually
### Steps to reproduce
- Run app
- Check Firebase Performance Console, click `View metrics details` from the App start time
# Behavior
### Scenario 1:
- Steps: Run app version `1.0` without `FirebaseInitProvider` and `FirebaseApp.initializeApp`
- Result: App start is recorded
### Scenario 2:
- Steps: Run app version `1.0.1` with `FirebaseApp.initializeApp` and `FirebaseInitProvider` disabled in `MainActivity`
- Result: App start is not recorded
### Scenario 3:
- Steps: Run app version `1.0.2` without `FirebaseInitProvider` and `FirebaseApp.initializeApp`
- Result: App start is recorded
### Scenario 4:
- Steps: Run app version `1.0.3` with `FirebaseApp.initializeApp` and `FirebaseInitProvider` disabled in Application class `MainApplication`
- Result: App start is not recorded


### Screenshot:
- As we can see here, the app start time for both version `1.0.1` and `1.0.3` is not recorded.
<img width="1280" alt="Screenshot 2023-03-10 at 6 28 19 PM" src="https://user-images.githubusercontent.com/93124282/224292804-9474e6b3-fa6e-41c0-b1d5-093eeb7ecae3.png">
