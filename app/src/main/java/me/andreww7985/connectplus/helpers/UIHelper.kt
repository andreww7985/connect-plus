package me.andreww7985.connectplus.helpers

import android.content.Intent
import android.util.Log
import android.widget.Toast
import me.andreww7985.connectplus.App
import me.andreww7985.connectplus.R
import me.andreww7985.connectplus.ui.activities.MainActivity

object UIHelper {
    private const val TAG = "UIHelper"
    private val app = App.instance

    fun showToast(text: String, duration: Int = Toast.LENGTH_LONG) {
        Toast.makeText(app, text, duration).show()
    }

    fun openMainActivity() {
        Log.d(TAG, "openMainActivity")
        val intent = Intent(app, MainActivity::class.java)
        intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
        app.startActivity(intent)
    }

    fun showFragment(activity: androidx.fragment.app.FragmentActivity, fragment: androidx.fragment.app.Fragment) {
        Log.d(TAG, "showFragment fragment name = ${fragment.javaClass.simpleName}")
        activity.supportFragmentManager.beginTransaction().replace(R.id.main_fragment, fragment).commitAllowingStateLoss()
    }
}