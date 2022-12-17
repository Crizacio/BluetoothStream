package com.crizacio.bluetoothstream;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class ItemListaDispositivo extends ArrayAdapter<Dispositivo> {
    private Activity context;
    List<Dispositivo> dispositivos;

    public ItemListaDispositivo(Activity context, List<Dispositivo> dispositivos) {
        super(context, R.layout.listitem, dispositivos);
        this.context = context;
        this.dispositivos = dispositivos;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        /*
         * RESUMEN:
         * Esto permite generar un objeto el cual tiene un Titulo y un Subtitulo
         * Esto queda bonito.
         * */
        LayoutInflater inflater = context.getLayoutInflater();
        View listViewItem = inflater.inflate(R.layout.listitem, null, true);

        TextView txt_Nombre = (TextView) listViewItem.findViewById(R.id.txtTitulo);
        TextView txt_Direccion = (TextView) listViewItem.findViewById(R.id.txtSubtitulo);

        Dispositivo dispositivo = dispositivos.get(position);
        txt_Nombre.setText(""+dispositivo.getNombre());
        txt_Direccion.setText(""+dispositivo.getDireccion());

        return listViewItem;
    }
}
// CODIGO BASE
//  https://github.com/Urfenox/ev2-IoT-App2/blob/master/app/src/main/java/com/crizacio/eva2_iot_app2/ListaAlumno.java