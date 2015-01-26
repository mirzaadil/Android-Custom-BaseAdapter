package com.cyberinnovation.custombaseadapter;

import java.util.ArrayList;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.widget.ListView;

import com.cyberinnovation.custombaseadapter.adapter.UserAdapter;
import com.cyberinnovation.custombaseadapter.model.UserModel;

public class MainActivity extends Activity {

	private ListView myListView;
	private ArrayList<UserModel> myArrayList;
	private UserAdapter myUserAdapter;
	private Context myContext;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		myContext = getApplicationContext();

		myListView = (ListView) findViewById(R.id.my_list);

		myArrayList = new ArrayList<UserModel>();
		myArrayList.add(new UserModel());
		myArrayList.add(new UserModel());
		myArrayList.add(new UserModel());
		myArrayList.add(new UserModel());
		myArrayList.add(new UserModel());

		myUserAdapter = new UserAdapter(myContext, myArrayList);

		myListView.setAdapter(myUserAdapter);
	}
}
