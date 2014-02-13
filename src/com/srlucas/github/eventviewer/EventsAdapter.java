package com.srlucas.github.eventviewer;

import java.util.ArrayList;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.srlucas.github.R;
import com.srlucas.github.eventviewer.model.Event;

/** 
 * This adapter will be in charge of converting the Event to a view
 * 
 * It has a cache to improve performance
 * 
 * @author srlucas
 *
 */
public class EventsAdapter extends ArrayAdapter<Event> {
	
    // View lookup cache
    private static class ViewHolder {
        TextView id;
        TextView type;
        TextView repo;
        TextView user;
    }

    public EventsAdapter(Context context, ArrayList<Event> Events) {
       super(context, R.layout.item_event, Events);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
    	
		// Get the data item for this position
		Event event = getItem(position);
		   
		// Check if an existing view is being reused, otherwise inflate the view
		ViewHolder viewHolder; // view lookup cache stored in tag
		
		if (convertView == null) {
			viewHolder = new ViewHolder();
			  
			LayoutInflater inflater = LayoutInflater.from(getContext());
			convertView = inflater.inflate(R.layout.item_event, null);
//			viewHolder.id = (TextView) convertView.findViewById(R.id.tvId);
			
			viewHolder.repo = (TextView) convertView.findViewById(R.id.tvRepo);
			viewHolder.user = (TextView) convertView.findViewById(R.id.tvUser);
			
//			viewHolder.type = (TextView) convertView.findViewById(R.id.tvType);
			convertView.setTag(viewHolder);

		} else {
			viewHolder = (ViewHolder) convertView.getTag();
		}
		
		// Populate the data into the template view using the data object
		StringBuilder userString = new StringBuilder()
			.append(event.user).append(" / ").append(event.type);
		
//		viewHolder.id.setText(event.id.toString());
		
		viewHolder.repo.setText(event.repo);
		viewHolder.user.setText(userString.toString());
		
//		viewHolder.type.setText(event.type);
		
		// Return the completed view to render on screen
		return convertView;
	}
}