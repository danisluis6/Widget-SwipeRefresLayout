> - **Widget-SwipeRefresLayout**
>> - [Instructing widget](#instructing-widget)
    
# Instructing widget

    Coding and loading...
    
    <android.support.v4.widget.SwipeRefreshLayout
        xmlns:android="http://schemas.android.com/apk/res/android"
        android:id="@+id/swipe_container"
        android:layout_width="match_parent"
        android:layout_height="match_parent">

        <ScrollView
            android:layout_width="match_parent"
            android:layout_height="match_parent">

            <TextView
                android:text="@string/hello_world"
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:layout_marginTop="16dp"
                android:gravity="center"/>
        </ScrollView>

    </android.support.v4.widget.SwipeRefreshLayout>
    
>> - swipeLayout.setEnabled(false);
>>> - If you set value equal "false". That lead wipeLayout is hidden
>>> - You should set enable(true) to make swipelayout will be performed.

>> - swipeLayout.setRefreshing(false); it means you want to cancel this manipulation while loading.
    
    For example: I want to stop loading after one second. How can I perform it?
    
    new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                swipeLayout.setRefreshing(false);
            }
        }, 1000);
   
# References
- Using this widget in Android
https://antonioleiva.com/swiperefreshlayout/

