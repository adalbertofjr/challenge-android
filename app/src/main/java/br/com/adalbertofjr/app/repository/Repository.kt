package br.com.adalbertofjr.app.repository

import br.com.adalbertofjr.app.model.Banner
import br.com.adalbertofjr.app.model.Categoria

open class Repository : RepositoryContract {
    override fun getBannerItems(): List<Banner> {
        return listOf(
                Banner(1,
                        "https://images-submarino.b2w.io/spacey/2017/02/06/MainTop_GAMES_FEV17.png",
                        "https://images-submarino.b2w.io/spacey/2017/02/06/MainTop_GAMES_FEV17.png"),
                Banner(2,
                        "https://images-submarino.b2w.io/spacey/2017/02/06/DESTAQUE_FULL_CARTAO_CASA_FEV.png",
                        "https://images-submarino.b2w.io/spacey/2017/02/06/DESTAQUE_FULL_CARTAO_CASA_FEV.png"),
                Banner(3,
                        "https://images-submarino.b2w.io/spacey/2017/02/03/sub-home-dest-full-655x328-touch-play.png",
                        "https://images-submarino.b2w.io/spacey/2017/02/03/sub-home-dest-full-655x328-touch-play.png"))
    }

    override fun getCategorias(): List<Categoria> {
        return listOf(
                Categoria(1,
                        "Games",
                        "http://39ahd9aq5l9101brf3b8dq58.wpengine.netdna-cdn.com/wp-content/uploads/2013/06/3D-Gaming.png"
                ),
                Categoria(2,
                        "Livros",
                        "http://4.bp.blogspot.com/-6Bta1H9d22g/UJAIJbqcHhI/AAAAAAAAKi4/hvgjWrlFc64/s1600/resenha-missiologia.png"
                ),
                Categoria(3,
                        "Celulares",
                        "http://pt.seaicons.com/wp-content/uploads/2015/11/Mobile-Smartphone-icon.png"
                ),
                Categoria(4,
                        "Informática",
                        "http://portal.ifrn.edu.br/campus/ceara-mirim/noticias/ifrn-oferece-curso-de-informatica-basica-para-pais-dos-estudantes/image_preview"
                ),
                Categoria(5,
                        "Eletrodoméstico",
                        "http://classificados.folharegiao.com.br/files/classificados_categoria/photo/8/sm_4d5ed3beb0f31b61cb9a01e46ecd0cf9.png"
                )
        )
    }
}