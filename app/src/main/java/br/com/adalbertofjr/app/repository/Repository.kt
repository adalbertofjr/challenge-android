package br.com.adalbertofjr.app.repository

import br.com.adalbertofjr.app.model.Banner
import br.com.adalbertofjr.app.model.Categoria
import br.com.adalbertofjr.app.model.Produto
import io.reactivex.Observable
import java.math.BigDecimal
import java.math.RoundingMode

open class Repository : RepositoryContract {

    override fun getBannerItems(): Observable<Banner> {
        val banners = mutableListOf(
                Banner(1,
                        "https://images-submarino.b2w.io/spacey/2017/02/06/MainTop_GAMES_FEV17.png",
                        "https://images-submarino.b2w.io/spacey/2017/02/06/MainTop_GAMES_FEV17.png"),
                Banner(2,
                        "https://images-submarino.b2w.io/spacey/2017/02/06/DESTAQUE_FULL_CARTAO_CASA_FEV.png",
                        "https://images-submarino.b2w.io/spacey/2017/02/06/DESTAQUE_FULL_CARTAO_CASA_FEV.png"),
                Banner(3,
                        "https://images-submarino.b2w.io/spacey/2017/02/03/sub-home-dest-full-655x328-touch-play.png",
                        "https://images-submarino.b2w.io/spacey/2017/02/03/sub-home-dest-full-655x328-touch-play.png"))

        Thread.sleep(5_000) // todo - remover simulação de espera

        return Observable.fromIterable(banners)
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

    override fun getMaisVendido(): List<Produto> {
        return listOf(
                Produto(1,
                        "Fifa 1",
                        "https://images-submarino.b2w.io/produtos/01/00/item/128926/4/128926443_1GG.png",
                        "Mussum Ipsum, cacilds vidis litro abertis. Atirei o pau no gatis, per gatis num morreus. Não sou faixa preta cumpadi, sou preto inteiris, inteiris. Praesent malesuada urna nisi, quis volutpat erat hendrerit non. Nam vulputate dapibus. Diuretics paradis num copo é motivis de denguis.<br/><br/>Copo furadis é disculpa de bebadis, arcu quam euismod magna. Casamentiss faiz malandris se pirulitá. Vehicula non. Ut sed ex eros. Vivamus sit amet nibh non tellus tristique interdum. in elementis mé pra quem é amistosis quis leo.<br/><br/>A ordem dos tratores não altera o pão duris Delegadis gente finis, bibendum egestas augue arcu ut est. Mé faiz elementum girarzis, nisi eros vermeio. Si u mundo tá muito paradis? Toma um mé que o mundo vai girarzis!",
                        BigDecimal(299).setScale(2, RoundingMode.HALF_EVEN),
                        BigDecimal(119.9899999999999948840923025272786617279052734375).setScale(2, RoundingMode.HALF_EVEN),
                        Categoria(1,
                                "Games",
                                "http://39ahd9aq5l9101brf3b8dq58.wpengine.netdna-cdn.com/wp-content/uploads/2013/06/3D-Gaming.png")
                ),
                Produto(2,
                        "Fifa 2",
                        "https://images-submarino.b2w.io/produtos/01/00/item/128926/4/128926443_1GG.png",
                        "Mussum Ipsum, cacilds vidis litro abertis. Atirei o pau no gatis, per gatis num morreus. Não sou faixa preta cumpadi, sou preto inteiris, inteiris. Praesent malesuada urna nisi, quis volutpat erat hendrerit non. Nam vulputate dapibus. Diuretics paradis num copo é motivis de denguis.<br/><br/>Copo furadis é disculpa de bebadis, arcu quam euismod magna. Casamentiss faiz malandris se pirulitá. Vehicula non. Ut sed ex eros. Vivamus sit amet nibh non tellus tristique interdum. in elementis mé pra quem é amistosis quis leo.<br/><br/>A ordem dos tratores não altera o pão duris Delegadis gente finis, bibendum egestas augue arcu ut est. Mé faiz elementum girarzis, nisi eros vermeio. Si u mundo tá muito paradis? Toma um mé que o mundo vai girarzis!",
                        BigDecimal(299).setScale(2, RoundingMode.HALF_EVEN),
                        BigDecimal(119.9899999999999948840923025272786617279052734375).setScale(2, RoundingMode.HALF_EVEN),
                        Categoria(1,
                                "Games",
                                "http://39ahd9aq5l9101brf3b8dq58.wpengine.netdna-cdn.com/wp-content/uploads/2013/06/3D-Gaming.png")
                ),
                Produto(3,
                        "Fifa 3",
                        "https://images-submarino.b2w.io/produtos/01/00/item/128926/4/128926443_1GG.png",
                        "Mussum Ipsum, cacilds vidis litro abertis. Atirei o pau no gatis, per gatis num morreus. Não sou faixa preta cumpadi, sou preto inteiris, inteiris. Praesent malesuada urna nisi, quis volutpat erat hendrerit non. Nam vulputate dapibus. Diuretics paradis num copo é motivis de denguis.<br/><br/>Copo furadis é disculpa de bebadis, arcu quam euismod magna. Casamentiss faiz malandris se pirulitá. Vehicula non. Ut sed ex eros. Vivamus sit amet nibh non tellus tristique interdum. in elementis mé pra quem é amistosis quis leo.<br/><br/>A ordem dos tratores não altera o pão duris Delegadis gente finis, bibendum egestas augue arcu ut est. Mé faiz elementum girarzis, nisi eros vermeio. Si u mundo tá muito paradis? Toma um mé que o mundo vai girarzis!",
                        BigDecimal(299).setScale(2, RoundingMode.HALF_EVEN),
                        BigDecimal(119.9899999999999948840923025272786617279052734375).setScale(2, RoundingMode.HALF_EVEN),
                        Categoria(1,
                                "Games",
                                "http://39ahd9aq5l9101brf3b8dq58.wpengine.netdna-cdn.com/wp-content/uploads/2013/06/3D-Gaming.png")
                ),
                Produto(4,
                        "Fifa 4",
                        "https://images-submarino.b2w.io/produtos/01/00/item/128926/4/128926443_1GG.png",
                        "Mussum Ipsum, cacilds vidis litro abertis. Atirei o pau no gatis, per gatis num morreus. Não sou faixa preta cumpadi, sou preto inteiris, inteiris. Praesent malesuada urna nisi, quis volutpat erat hendrerit non. Nam vulputate dapibus. Diuretics paradis num copo é motivis de denguis.<br/><br/>Copo furadis é disculpa de bebadis, arcu quam euismod magna. Casamentiss faiz malandris se pirulitá. Vehicula non. Ut sed ex eros. Vivamus sit amet nibh non tellus tristique interdum. in elementis mé pra quem é amistosis quis leo.<br/><br/>A ordem dos tratores não altera o pão duris Delegadis gente finis, bibendum egestas augue arcu ut est. Mé faiz elementum girarzis, nisi eros vermeio. Si u mundo tá muito paradis? Toma um mé que o mundo vai girarzis!",
                        BigDecimal(299).setScale(2, RoundingMode.HALF_EVEN),
                        BigDecimal(119.9899999999999948840923025272786617279052734375).setScale(2, RoundingMode.HALF_EVEN),
                        Categoria(1,
                                "Games",
                                "http://39ahd9aq5l9101brf3b8dq58.wpengine.netdna-cdn.com/wp-content/uploads/2013/06/3D-Gaming.png")
                ),
                Produto(5,
                        "Fifa 5",
                        "https://images-submarino.b2w.io/produtos/01/00/item/128926/4/128926443_1GG.png",
                        "Mussum Ipsum, cacilds vidis litro abertis. Atirei o pau no gatis, per gatis num morreus. Não sou faixa preta cumpadi, sou preto inteiris, inteiris. Praesent malesuada urna nisi, quis volutpat erat hendrerit non. Nam vulputate dapibus. Diuretics paradis num copo é motivis de denguis.<br/><br/>Copo furadis é disculpa de bebadis, arcu quam euismod magna. Casamentiss faiz malandris se pirulitá. Vehicula non. Ut sed ex eros. Vivamus sit amet nibh non tellus tristique interdum. in elementis mé pra quem é amistosis quis leo.<br/><br/>A ordem dos tratores não altera o pão duris Delegadis gente finis, bibendum egestas augue arcu ut est. Mé faiz elementum girarzis, nisi eros vermeio. Si u mundo tá muito paradis? Toma um mé que o mundo vai girarzis!",
                        BigDecimal(299).setScale(2, RoundingMode.HALF_EVEN),
                        BigDecimal(119.9899999999999948840923025272786617279052734375).setScale(2, RoundingMode.HALF_EVEN),
                        Categoria(1,
                                "Games",
                                "http://39ahd9aq5l9101brf3b8dq58.wpengine.netdna-cdn.com/wp-content/uploads/2013/06/3D-Gaming.png")
                ),
                Produto(6,
                        "Fifa 6",
                        "https://images-submarino.b2w.io/produtos/01/00/item/128926/4/128926443_1GG.png",
                        "Mussum Ipsum, cacilds vidis litro abertis. Atirei o pau no gatis, per gatis num morreus. Não sou faixa preta cumpadi, sou preto inteiris, inteiris. Praesent malesuada urna nisi, quis volutpat erat hendrerit non. Nam vulputate dapibus. Diuretics paradis num copo é motivis de denguis.<br/><br/>Copo furadis é disculpa de bebadis, arcu quam euismod magna. Casamentiss faiz malandris se pirulitá. Vehicula non. Ut sed ex eros. Vivamus sit amet nibh non tellus tristique interdum. in elementis mé pra quem é amistosis quis leo.<br/><br/>A ordem dos tratores não altera o pão duris Delegadis gente finis, bibendum egestas augue arcu ut est. Mé faiz elementum girarzis, nisi eros vermeio. Si u mundo tá muito paradis? Toma um mé que o mundo vai girarzis!",
                        BigDecimal(299).setScale(2, RoundingMode.HALF_EVEN),
                        BigDecimal(119.9899999999999948840923025272786617279052734375).setScale(2, RoundingMode.HALF_EVEN),
                        Categoria(1,
                                "Games",
                                "http://39ahd9aq5l9101brf3b8dq58.wpengine.netdna-cdn.com/wp-content/uploads/2013/06/3D-Gaming.png")
                ),
                Produto(7,
                        "Fifa 7",
                        "https://images-submarino.b2w.io/produtos/01/00/item/128926/4/128926443_1GG.png",
                        "Mussum Ipsum, cacilds vidis litro abertis. Atirei o pau no gatis, per gatis num morreus. Não sou faixa preta cumpadi, sou preto inteiris, inteiris. Praesent malesuada urna nisi, quis volutpat erat hendrerit non. Nam vulputate dapibus. Diuretics paradis num copo é motivis de denguis.<br/><br/>Copo furadis é disculpa de bebadis, arcu quam euismod magna. Casamentiss faiz malandris se pirulitá. Vehicula non. Ut sed ex eros. Vivamus sit amet nibh non tellus tristique interdum. in elementis mé pra quem é amistosis quis leo.<br/><br/>A ordem dos tratores não altera o pão duris Delegadis gente finis, bibendum egestas augue arcu ut est. Mé faiz elementum girarzis, nisi eros vermeio. Si u mundo tá muito paradis? Toma um mé que o mundo vai girarzis!",
                        BigDecimal(299).setScale(2, RoundingMode.HALF_EVEN),
                        BigDecimal(119.9899999999999948840923025272786617279052734375).setScale(2, RoundingMode.HALF_EVEN),
                        Categoria(1,
                                "Games",
                                "http://39ahd9aq5l9101brf3b8dq58.wpengine.netdna-cdn.com/wp-content/uploads/2013/06/3D-Gaming.png")
                ),
                Produto(8,
                        "Fifa 8",
                        "https://images-submarino.b2w.io/produtos/01/00/item/128926/4/128926443_1GG.png",
                        "Mussum Ipsum, cacilds vidis litro abertis. Atirei o pau no gatis, per gatis num morreus. Não sou faixa preta cumpadi, sou preto inteiris, inteiris. Praesent malesuada urna nisi, quis volutpat erat hendrerit non. Nam vulputate dapibus. Diuretics paradis num copo é motivis de denguis.<br/><br/>Copo furadis é disculpa de bebadis, arcu quam euismod magna. Casamentiss faiz malandris se pirulitá. Vehicula non. Ut sed ex eros. Vivamus sit amet nibh non tellus tristique interdum. in elementis mé pra quem é amistosis quis leo.<br/><br/>A ordem dos tratores não altera o pão duris Delegadis gente finis, bibendum egestas augue arcu ut est. Mé faiz elementum girarzis, nisi eros vermeio. Si u mundo tá muito paradis? Toma um mé que o mundo vai girarzis!",
                        BigDecimal(299).setScale(2, RoundingMode.HALF_EVEN),
                        BigDecimal(119.9899999999999948840923025272786617279052734375).setScale(2, RoundingMode.HALF_EVEN),
                        Categoria(1,
                                "Games",
                                "http://39ahd9aq5l9101brf3b8dq58.wpengine.netdna-cdn.com/wp-content/uploads/2013/06/3D-Gaming.png")
                ),
                Produto(9,
                        "Fifa 9",
                        "https://images-submarino.b2w.io/produtos/01/00/item/128926/4/128926443_1GG.png",
                        "Mussum Ipsum, cacilds vidis litro abertis. Atirei o pau no gatis, per gatis num morreus. Não sou faixa preta cumpadi, sou preto inteiris, inteiris. Praesent malesuada urna nisi, quis volutpat erat hendrerit non. Nam vulputate dapibus. Diuretics paradis num copo é motivis de denguis.<br/><br/>Copo furadis é disculpa de bebadis, arcu quam euismod magna. Casamentiss faiz malandris se pirulitá. Vehicula non. Ut sed ex eros. Vivamus sit amet nibh non tellus tristique interdum. in elementis mé pra quem é amistosis quis leo.<br/><br/>A ordem dos tratores não altera o pão duris Delegadis gente finis, bibendum egestas augue arcu ut est. Mé faiz elementum girarzis, nisi eros vermeio. Si u mundo tá muito paradis? Toma um mé que o mundo vai girarzis!",
                        BigDecimal(299).setScale(2, RoundingMode.HALF_EVEN),
                        BigDecimal(119.9899999999999948840923025272786617279052734375).setScale(2, RoundingMode.HALF_EVEN),
                        Categoria(1,
                                "Games",
                                "http://39ahd9aq5l9101brf3b8dq58.wpengine.netdna-cdn.com/wp-content/uploads/2013/06/3D-Gaming.png")
                ),
                Produto(10,
                        "Fifa 10",
                        "https://images-submarino.b2w.io/produtos/01/00/item/128926/4/128926443_1GG.png",
                        "Mussum Ipsum, cacilds vidis litro abertis. Atirei o pau no gatis, per gatis num morreus. Não sou faixa preta cumpadi, sou preto inteiris, inteiris. Praesent malesuada urna nisi, quis volutpat erat hendrerit non. Nam vulputate dapibus. Diuretics paradis num copo é motivis de denguis.<br/><br/>Copo furadis é disculpa de bebadis, arcu quam euismod magna. Casamentiss faiz malandris se pirulitá. Vehicula non. Ut sed ex eros. Vivamus sit amet nibh non tellus tristique interdum. in elementis mé pra quem é amistosis quis leo.<br/><br/>A ordem dos tratores não altera o pão duris Delegadis gente finis, bibendum egestas augue arcu ut est. Mé faiz elementum girarzis, nisi eros vermeio. Si u mundo tá muito paradis? Toma um mé que o mundo vai girarzis!",
                        BigDecimal(299).setScale(2, RoundingMode.HALF_EVEN),
                        BigDecimal(119.9899999999999948840923025272786617279052734375).setScale(2, RoundingMode.HALF_EVEN),
                        Categoria(1,
                                "Games",
                                "http://39ahd9aq5l9101brf3b8dq58.wpengine.netdna-cdn.com/wp-content/uploads/2013/06/3D-Gaming.png")
                ),
                Produto(11,
                        "Fifa 11",
                        "https://images-submarino.b2w.io/produtos/01/00/item/128926/4/128926443_1GG.png",
                        "Mussum Ipsum, cacilds vidis litro abertis. Atirei o pau no gatis, per gatis num morreus. Não sou faixa preta cumpadi, sou preto inteiris, inteiris. Praesent malesuada urna nisi, quis volutpat erat hendrerit non. Nam vulputate dapibus. Diuretics paradis num copo é motivis de denguis.<br/><br/>Copo furadis é disculpa de bebadis, arcu quam euismod magna. Casamentiss faiz malandris se pirulitá. Vehicula non. Ut sed ex eros. Vivamus sit amet nibh non tellus tristique interdum. in elementis mé pra quem é amistosis quis leo.<br/><br/>A ordem dos tratores não altera o pão duris Delegadis gente finis, bibendum egestas augue arcu ut est. Mé faiz elementum girarzis, nisi eros vermeio. Si u mundo tá muito paradis? Toma um mé que o mundo vai girarzis!",
                        BigDecimal(299).setScale(2, RoundingMode.HALF_EVEN),
                        BigDecimal(119.9899999999999948840923025272786617279052734375).setScale(2, RoundingMode.HALF_EVEN),
                        Categoria(1,
                                "Games",
                                "http://39ahd9aq5l9101brf3b8dq58.wpengine.netdna-cdn.com/wp-content/uploads/2013/06/3D-Gaming.png")
                )
        )
    }
}