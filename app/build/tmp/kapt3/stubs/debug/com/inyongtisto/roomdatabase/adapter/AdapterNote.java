package com.inyongtisto.roomdatabase.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0002\u0016\u0017B\u001b\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\r\u001a\u00020\u000eH\u0016J\u001c\u0010\u000f\u001a\u00020\u00102\n\u0010\u0011\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u000eH\u0017J\u001c\u0010\u0013\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u000eH\u0016R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/inyongtisto/roomdatabase/adapter/AdapterNote;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/inyongtisto/roomdatabase/adapter/AdapterNote$ViewHolder;", "mData", "", "Lcom/inyongtisto/roomdatabase/model/NoteModel;", "listener", "Lcom/inyongtisto/roomdatabase/adapter/AdapterNote$Listeners;", "(Ljava/util/List;Lcom/inyongtisto/roomdatabase/adapter/AdapterNote$Listeners;)V", "getListener", "()Lcom/inyongtisto/roomdatabase/adapter/AdapterNote$Listeners;", "setListener", "(Lcom/inyongtisto/roomdatabase/adapter/AdapterNote$Listeners;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "i", "onCreateViewHolder", "viewGroup", "Landroid/view/ViewGroup;", "Listeners", "ViewHolder", "app_debug"})
public final class AdapterNote extends androidx.recyclerview.widget.RecyclerView.Adapter<com.inyongtisto.roomdatabase.adapter.AdapterNote.ViewHolder> {
    private java.util.List<com.inyongtisto.roomdatabase.model.NoteModel> mData;
    @org.jetbrains.annotations.NotNull()
    private com.inyongtisto.roomdatabase.adapter.AdapterNote.Listeners listener;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.inyongtisto.roomdatabase.adapter.AdapterNote.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup viewGroup, int i) {
        return null;
    }
    
    @android.annotation.SuppressLint(value = {"SetTextI18n"})
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.inyongtisto.roomdatabase.adapter.AdapterNote.ViewHolder holder, int i) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.inyongtisto.roomdatabase.adapter.AdapterNote.Listeners getListener() {
        return null;
    }
    
    public final void setListener(@org.jetbrains.annotations.NotNull()
    com.inyongtisto.roomdatabase.adapter.AdapterNote.Listeners p0) {
    }
    
    public AdapterNote(@org.jetbrains.annotations.NotNull()
    java.util.List<com.inyongtisto.roomdatabase.model.NoteModel> mData, @org.jetbrains.annotations.NotNull()
    com.inyongtisto.roomdatabase.adapter.AdapterNote.Listeners listener) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/inyongtisto/roomdatabase/adapter/AdapterNote$Listeners;", "", "onClicked", "", "note", "Lcom/inyongtisto/roomdatabase/model/NoteModel;", "app_debug"})
    public static abstract interface Listeners {
        
        public abstract void onClicked(@org.jetbrains.annotations.NotNull()
        com.inyongtisto.roomdatabase.model.NoteModel note);
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010\u00a8\u0006\u0014"}, d2 = {"Lcom/inyongtisto/roomdatabase/adapter/AdapterNote$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lcom/inyongtisto/roomdatabase/adapter/AdapterNote;Landroid/view/View;)V", "layout", "Landroidx/cardview/widget/CardView;", "getLayout", "()Landroidx/cardview/widget/CardView;", "setLayout", "(Landroidx/cardview/widget/CardView;)V", "tvDesc", "Landroid/widget/TextView;", "getTvDesc", "()Landroid/widget/TextView;", "setTvDesc", "(Landroid/widget/TextView;)V", "tvTitle", "getTvTitle", "setTvTitle", "app_debug"})
    public final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView tvTitle;
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView tvDesc;
        @org.jetbrains.annotations.NotNull()
        private androidx.cardview.widget.CardView layout;
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getTvTitle() {
            return null;
        }
        
        public final void setTvTitle(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getTvDesc() {
            return null;
        }
        
        public final void setTvDesc(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.cardview.widget.CardView getLayout() {
            return null;
        }
        
        public final void setLayout(@org.jetbrains.annotations.NotNull()
        androidx.cardview.widget.CardView p0) {
        }
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
    }
}