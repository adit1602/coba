// Generated by view binder compiler. Do not edit!
package com.dicoding.foodiescovery.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.dicoding.foodiescovery.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentHomeBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final CardView cvRandomMeal;

  @NonNull
  public final ImageView ivRandomMeal;

  @NonNull
  public final LinearLayout llHeader;

  @NonNull
  public final RecyclerView rvCategories;

  @NonNull
  public final RecyclerView rvPopularMeals;

  @NonNull
  public final TextView tvCategories;

  @NonNull
  public final TextView tvPopularMeals;

  @NonNull
  public final TextView tvWhatWouldYouLikeToEat;

  private FragmentHomeBinding(@NonNull ConstraintLayout rootView, @NonNull CardView cvRandomMeal,
      @NonNull ImageView ivRandomMeal, @NonNull LinearLayout llHeader,
      @NonNull RecyclerView rvCategories, @NonNull RecyclerView rvPopularMeals,
      @NonNull TextView tvCategories, @NonNull TextView tvPopularMeals,
      @NonNull TextView tvWhatWouldYouLikeToEat) {
    this.rootView = rootView;
    this.cvRandomMeal = cvRandomMeal;
    this.ivRandomMeal = ivRandomMeal;
    this.llHeader = llHeader;
    this.rvCategories = rvCategories;
    this.rvPopularMeals = rvPopularMeals;
    this.tvCategories = tvCategories;
    this.tvPopularMeals = tvPopularMeals;
    this.tvWhatWouldYouLikeToEat = tvWhatWouldYouLikeToEat;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentHomeBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentHomeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_home, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentHomeBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.cv_random_meal;
      CardView cvRandomMeal = ViewBindings.findChildViewById(rootView, id);
      if (cvRandomMeal == null) {
        break missingId;
      }

      id = R.id.iv_random_meal;
      ImageView ivRandomMeal = ViewBindings.findChildViewById(rootView, id);
      if (ivRandomMeal == null) {
        break missingId;
      }

      id = R.id.ll_header;
      LinearLayout llHeader = ViewBindings.findChildViewById(rootView, id);
      if (llHeader == null) {
        break missingId;
      }

      id = R.id.rv_categories;
      RecyclerView rvCategories = ViewBindings.findChildViewById(rootView, id);
      if (rvCategories == null) {
        break missingId;
      }

      id = R.id.rv_popular_meals;
      RecyclerView rvPopularMeals = ViewBindings.findChildViewById(rootView, id);
      if (rvPopularMeals == null) {
        break missingId;
      }

      id = R.id.tv_categories;
      TextView tvCategories = ViewBindings.findChildViewById(rootView, id);
      if (tvCategories == null) {
        break missingId;
      }

      id = R.id.tv_popular_meals;
      TextView tvPopularMeals = ViewBindings.findChildViewById(rootView, id);
      if (tvPopularMeals == null) {
        break missingId;
      }

      id = R.id.tv_what_would_you_like_to_eat;
      TextView tvWhatWouldYouLikeToEat = ViewBindings.findChildViewById(rootView, id);
      if (tvWhatWouldYouLikeToEat == null) {
        break missingId;
      }

      return new FragmentHomeBinding((ConstraintLayout) rootView, cvRandomMeal, ivRandomMeal,
          llHeader, rvCategories, rvPopularMeals, tvCategories, tvPopularMeals,
          tvWhatWouldYouLikeToEat);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
