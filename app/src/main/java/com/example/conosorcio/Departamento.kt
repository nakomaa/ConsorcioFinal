package com.example.conosorcio

import android.os.Parcel
import android.os.Parcelable

data class Departamento(var letraDepartamento: String) : Parcelable {// Esta es una clase de tipo data class.
    constructor(parcel: Parcel) : this(parcel.readString().toString()) {// es data class y tiene implementado los metodos
    }                                                                   //parcelables
                                                                        //contiene 1 propiedad que es letra departamento de tipo string.


    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(letraDepartamento)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Departamento> {
        override fun createFromParcel(parcel: Parcel): Departamento {
            return Departamento(parcel)
        }

        override fun newArray(size: Int): Array<Departamento?> {
            return arrayOfNulls(size)
        }
    }

}