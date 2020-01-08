package id.ac.poliban.dts.ade.negaracustomlistview;

import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;
import java.util.List;

public class CountryDataAdapter extends BaseAdapter {
    private List<Country> data  = new ArrayList<>();

    public CountryDataAdapter (List<Country> data) {
        this.data = data;
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int position) {
        return data.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView img_flag;
        TextView tvCountryName;
        TextView tvCountryDesc;
        convertView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_country_list, parent, false);
//deklarasikan View
        img_flag = convertView.findViewById(R.id.img_country_flag_list);
        tvCountryName = convertView.findViewById(R.id.tv_country_name);
        tvCountryDesc = convertView.findViewById(R.id.tv_country_detail);
//isi data
        Glide.with(parent.getContext())
                .load(data.get(position).getFlag())
                .apply(new RequestOptions().override(60, 60))
                .into(img_flag);
        tvCountryName.setText(data.get(position).getCountryName());
        tvCountryDesc.setText(data.get(position).getCountryDetail());
        return convertView;
    }
}
