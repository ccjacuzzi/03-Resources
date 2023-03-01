package com.ualr.a03_resources;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.os.Bundle;

import com.ualr.a03_resources.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityMainBinding binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // TODO 02. Set a new source image for the ImageView
        binding.image.setImageResource(R.drawable.photo);

        // TODO 03. Set a new text for the TextView
        binding.text.setText(R.string.lorem_ipsum);

        // TODO 04. Set a new text color for the TextView.
        // We cannot use the resource id. We have to pass the resolved color instead
        binding.text.setTextColor(getResources().getColor(R.color.colorAccent));

        Utils.setTextColor(binding.text, true, this.getApplicationContext());

        // TODO 04.01. Get a reference to the current instance of the Resources class
        // TODO 04.02. Get the actual color value

        // TODO 05. How can we use the Resource class from any class.
        // TODO 05.01. Define a new class called Utils with just one static method to get a color value based on a given color resource id

        // TODO 08. Get values in the string array
        String[] planets = getResources().getStringArray(R.array.planets);
        String planet = planets[1];

        // TODO 09. Use the Resource class to get a Drawable from a resource

        // TODO 10. Import a new vector image using Vector Asset Studio
        // TODO 11. Import a new vector image from the Android Material Icon library.
        // TODO 16. Use the translatable string fo the TextView.

        // TODO 17. Define a color state list to set a different background color for the button depending on the state.
    }
}