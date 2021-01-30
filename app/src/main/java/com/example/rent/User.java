package com.example.rent;

import android.content.Context;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.*;


public class User{

	private String URL_REGISTER = "";
	private String URL_USER = "";

	private String id, userName, name, address, phone, password;
	private Context context;
	private Long lat, lon;

	public User(){
	}

	public User(Context context, String id, String userName, String address, String phone, String password, long lat, long lon){
		this.context = context;
		this.id = id;
		this.userName = userName;
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.password = password;
		this.lat = lat;
		this.lon = lon;
	}

	public Context getContext() {
		return context;
	}

	public void setContext(Context context) {
		this.context = context;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Long getLat() {
		return lat;
	}

	public void setLat(Long lat) {
		this.lat = lat;
	}

	public Long getLon() {
		return lon;
	}

	public void setLon(Long lon) {
		this.lon = lon;
	}

	public void newUser(final Context context, String userName, String name, String address, String phone, String password){

		StringRequest stringRequest = new  StringRequest(Request.Method.POST, URL_REGISTER,
				new Response.Listener<String>() {
					@Override
					public void onResponse(String response) {
						try {
							JSONObject jsonObject = new JSONObject(response);
							String success = jsonObject.getString("success");
						} catch (JSONException e) {
							e.printStackTrace();
							Toast.makeText(context,"Register error " + e.toString(), Toast.LENGTH_LONG).show();
						}
					}
				},
				new Response.ErrorListener() {
					@Override
					public void onErrorResponse(VolleyError error) {

					}
				}){
			@Override
			protected Map<String, String> getParams() throws AuthFailureError {
				Map<String, String> params = new HashMap<>();
				// variable to be add here
				return params;
			}
		};
	}

	public void login(final Context context, String userName, String password){

		StringRequest stringRequest = new StringRequest(Request.Method.POST, URL_USER,
				new Response.Listener<String>() {
					@Override
					public void onResponse(String response) {
						try {
							JSONObject jsonObject = new JSONObject(response);
							String success = jsonObject.getString("success");
						} catch (JSONException e) {
							e.printStackTrace();
							Toast.makeText(context,"Register error " + e.toString(), Toast.LENGTH_LONG).show();
						}
					}
				},
				new Response.ErrorListener() {
					@Override
					public void onErrorResponse(VolleyError error) {

					}
				}){
			@Override
			protected Map<String, String> getParams() throws AuthFailureError {
				Map<String, String> params = new HashMap<>();
				// variable to be add here
				return params;
			}
		};

	}


}