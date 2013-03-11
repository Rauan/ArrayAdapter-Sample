package com.example.arrayadaptersample;

import adapter.FriendsAdapter;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import object.UserFB;

import java.util.ArrayList;

public class MainActivity extends Activity {

	private FriendsAdapter adapter;
	private final ArrayList<UserFB> fetch = new ArrayList<UserFB>();
	private ListView lv;

	@Override
	protected void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		UserFB one = new UserFB("1", "Парк-авеню, 666",
				"http://torrents.kharkov.ua/torrents/images/thumb2_544700.jpg");
		UserFB two = new UserFB("2", "Викинги ",
				"http://torrents.kharkov.ua/torrents/images/thumb2_571090.jpg");
		UserFB three = new UserFB("3", "Подозреваемый",
				"http://torrents.kharkov.ua/torrents/images/thumb2_540790.jpg");
		fetch.add(one);
		fetch.add(two);
		fetch.add(three);
		lv = (ListView) findViewById(R.id.listView1);
		adapter = new FriendsAdapter(MainActivity.this, R.id.listView1, fetch);
		lv.setAdapter(adapter);
	}
}
