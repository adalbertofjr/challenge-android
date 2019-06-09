package br.com.adalbertofjr.app.model

import android.os.Parcel
import android.os.Parcelable

data class Produto(
        val id: Int,
        val nome: String,
        val urlImagem: String,
        val descricao: String,
        val precoDe: Double,
        val precoPor: Double,
        val categoria: Categoria
) : Parcelable {
    constructor(parcel: Parcel) : this(
            parcel.readInt(),
            parcel.readString(),
            parcel.readString(),
            parcel.readString(),
            parcel.readDouble(),
            parcel.readDouble(),
            parcel.readParcelable(Categoria::class.java.classLoader))

    override fun toString(): String = nome
    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeInt(id)
        parcel.writeString(nome)
        parcel.writeString(urlImagem)
        parcel.writeString(descricao)
        parcel.writeDouble(precoDe)
        parcel.writeDouble(precoPor)
        parcel.writeParcelable(categoria, flags)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Produto> {
        override fun createFromParcel(parcel: Parcel): Produto {
            return Produto(parcel)
        }

        override fun newArray(size: Int): Array<Produto?> {
            return arrayOfNulls(size)
        }
    }
}
