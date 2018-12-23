
package com.reactlibrary;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;

// include Toast
import android.widget.Toast;

public class RNInstacaptureLibraryModule extends ReactContextBaseJavaModule {

  private final ReactApplicationContext reactContext;

  public RNInstacaptureLibraryModule(ReactApplicationContext reactContext) {
    super(reactContext);
    this.reactContext = reactContext;
  }

  @Override
  public String getName() {
    return "RNInstacaptureLibrary";
  }

  @ReactMethod
  public void capture() {
    Toast.makeText(getReactApplicationContext(), "Hello World, I am Youssef :D", Toast.LENGTH_LONG).show();
    takeScreenshot();
  }
  

  @ReactMethod
  public void takeScreenshot() {
  Date now = new Date();
  android.text.format.DateFormat.format("yyyy-MM-dd_hh:mm:ss", now);

  
  try {
      // image naming and path  to include sd card  appending name you choose for file
      String mPath = Environment.getExternalStorageDirectory().toString() + "/" + now + ".jpg";

      // create bitmap screen capture
      //View v1 = getWindow().getDecorView().getRootView();

      View v1 = getCurrentActivity().getWindow().getDecorView().getRootView();
      Bitmap bitmap = Bitmap.createBitmap(v1.getDrawingCache());
      v1.setDrawingCacheEnabled(false);

      File imageFile = new File(mPath);

      FileOutputStream outputStream = new FileOutputStream(imageFile);
      int quality = 100;
      bitmap.compress(Bitmap.CompressFormat.JPEG, quality, outputStream);
      outputStream.flush();
      outputStream.close();

  } catch (Throwable e) {
      // Several error may come out with file handling or DOM
      e.printStackTrace();
  }
}
}

  
  
    
    
    
  
