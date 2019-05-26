package br.com.adalbertofjr.app.repository

import br.com.adalbertofjr.app.model.Banner

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
}