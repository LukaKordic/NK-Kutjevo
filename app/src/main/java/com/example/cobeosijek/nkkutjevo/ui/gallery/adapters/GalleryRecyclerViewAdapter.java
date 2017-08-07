package com.example.cobeosijek.nkkutjevo.ui.gallery.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.cobeosijek.nkkutjevo.R;
import com.example.cobeosijek.nkkutjevo.data_objects.ImageModel;
import com.example.cobeosijek.nkkutjevo.ui.gallery.GalleryClickListener;
import com.example.cobeosijek.nkkutjevo.ui.gallery.holders.ImageHolder;

import java.util.ArrayList;
import java.util.List;

public class GalleryRecyclerViewAdapter extends RecyclerView.Adapter<ImageHolder> {

    private GalleryClickListener galleryClickListener;
    private final List<ImageModel> imageModelList = new ArrayList<>();

    public void setGalleryClickListener(GalleryClickListener galleryClickListener) {
        this.galleryClickListener = galleryClickListener;
    }

    public void setImageModelList(List<ImageModel> list) {
        imageModelList.clear();
        imageModelList.addAll(list);
        notifyDataSetChanged();
    }

    @Override
    public ImageHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.gallery_recycler_view_item, parent, false);
        return new ImageHolder(view, galleryClickListener);
    }

    @Override
    public void onBindViewHolder(ImageHolder holder, int position) {
        ImageModel imageModel = getItem(position);

        holder.setImageModel(imageModel);
        holder.showImage();
    }

    @Override
    public int getItemCount() {
        return imageModelList.size();
    }

    private ImageModel getItem(int position) {
        if (position < getItemCount()) {
            ImageModel imageModel = imageModelList.get(position);
            return imageModel != null ? imageModel : new ImageModel();
        }
        return new ImageModel();
    }
}
