package net.learn2develop.HelloWorld;
//ggggggggggggggggggggggg
import android.app.Activity;
import android.os.Bundle;

public class MainActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        System.out.println("Test One");
        System.out.println("Helloooooooooooooooooo");
    }
    
}