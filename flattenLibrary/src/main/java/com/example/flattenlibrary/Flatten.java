package com.example.flattenlibrary;

import android.content.Context;
import android.widget.Toast;

import com.pdftron.common.PDFNetException;
import com.pdftron.pdf.PDFDoc;

import java.io.File;

public class Flatten {
  /*  public static void simpleToast(Context context, String msg) {
        Toast.makeText(context, msg, Toast.LENGTH_SHORT).show();
    }*/
    public static File flattenDocument(File file){
        PDFDoc doc = null;
        try {
            doc = new PDFDoc(String.valueOf(file));
            doc.flattenAnnotations(true);
        } catch (PDFNetException e) {
            e.printStackTrace();
        }

        return file;
    }
    public static void simpleNewToast(Context context, String msg) {
        Toast.makeText(context, msg, Toast.LENGTH_SHORT).show();
    }
}
