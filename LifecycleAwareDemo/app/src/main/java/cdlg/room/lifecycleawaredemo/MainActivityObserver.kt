package cdlg.room.lifecycleawaredemo

import android.nfc.Tag
import android.util.Log
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.OnLifecycleEvent

class MainActivityObserver: LifecycleObserver {
    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    fun onCreateEvent(){
        Log.i(TAG, "Observer Oncreate")
    }

    companion object{
        private val TAG: String = MainActivityObserver::class.java.simpleName

    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    fun onStartEvent(){
        Log.i(TAG, "Observer onStart")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    fun onResumeEvent(){
        Log.i(TAG, "Observer onResume")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    fun onPauseEvent(){
        Log.i(TAG, "Observer onPause")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    fun onStopEvent(){
        Log.i(TAG, "Observer onStopped")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    fun onDestoryEvent(){
        Log.i(TAG, "Observer onDestroyed")
    }

}