package com.cyberinnovation.custombaseadapter.adapter;

import java.util.List;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.cyberinnovation.custombaseadapter.R;
import com.cyberinnovation.custombaseadapter.model.UserModel;

public class UserAdapter extends BaseAdapter {

	private Context myContext;
	private List<UserModel> list;

	public UserAdapter(Context myContext, List<UserModel> data) {
		super();
		this.myContext = myContext;
		this.list = data;
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return list.size();
	}

	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return getItem(position);
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		final ViewHolder holder;
		try {
			if (convertView == null) {
				holder = new ViewHolder();
				LayoutInflater inflater = (LayoutInflater) myContext
						.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
				convertView = inflater.inflate(R.layout.user_adapter, null);
				holder.myImage = (ImageView) convertView
						.findViewById(R.id.image_view);
				holder.myUserName = (TextView) convertView
						.findViewById(R.id.text_user_name);
				holder.myMessage = (TextView) convertView
						.findViewById(R.id.text_user_message);
				convertView.setTag(holder);
			} else {
				holder = (ViewHolder) convertView.getTag();
			}

			UserModel model = list.get(position);

			BitmapDrawable bitmapDrawable = (BitmapDrawable) myContext
					.getResources().getDrawable(R.drawable.assign_name_icon);

			holder.myImage.setImageDrawable(bitmapDrawable);
			holder.myUserName.setText(model.getUser_name());
			holder.myMessage.setText(model.getUser_message());
		} catch (Exception e) {
			// TODO: handle exception
		}

		return convertView;
	}

	private class ViewHolder {
		ImageView myImage;
		TextView myUserName;
		TextView myMessage;
	}
}
