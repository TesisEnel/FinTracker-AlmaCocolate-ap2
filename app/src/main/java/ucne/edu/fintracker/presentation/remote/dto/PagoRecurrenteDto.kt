package ucne.edu.fintracker.presentation.remote.dto

import org.threeten.bp.OffsetDateTime

data class PagoRecurrenteDto(
    val pagoRecurrenteId: Int = 0,
    val monto: Double,
    val categoriaId: Int,
//    val categoria: CategoriaDto,
    val frecuencia: String, // "Mensual", "Semanal", etc.
    val fechaInicio: OffsetDateTime,
    val fechaFin: OffsetDateTime? = null,
    val activo: Boolean = true,
    val usuarioId: Int
)
