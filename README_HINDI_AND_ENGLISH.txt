GHS Gehal Android App - Cloud APK Build

This is the Android project for the GHS Gehal school-management WebView app.
The ZIP contains source code, not a prebuilt APK.

BUILD APK WITHOUT ANDROID STUDIO (using GitHub):
1. Create/sign in to a GitHub account.
2. Create a NEW repository (for example: ghs-gehal-app).
3. Extract this ZIP on your computer.
4. Upload the CONTENTS of the folder GHS_Gehal_Android_Project to the repository root.
   Important: .github/workflows/build-apk.yml must appear in the repository.
5. Open the repository's Actions tab.
6. Select "Build GHS Gehal APK" and click "Run workflow" (or push to main).
7. Wait for the workflow to finish successfully.
8. Open the completed workflow run, scroll to Artifacts, and download
   "GHS-Gehal-debug-apk". Extract it; app-debug.apk is the APK.

No Android Studio installation is required on the old Mac.

Project notes:
- Package: in.ghsgehal.school
- App label: GHS Gehal
- Website is bundled locally in the app.
- Demo passwords currently used by the HTML are 1234.
- This is a local demo; data is stored on that device and is not synchronized
  between multiple phones. For real school-wide use, a secure online backend
  and authentication are needed.
