function verificar(xhr, status, args, dlg, tbl) {
	if (args.validationFailed) {
		PF(dlg).jq.effect("shake", {
			times : 5
		}, 100);
	} else {
		PF(dlg).hide();
		PF(tbl).clearFilters();
	}
}

PrimeFaces.locales['pt_BR'] = {
	    closeText : 'Fechar',
	    prevText : 'Anterior',
	    nextText : 'Próximo',
	    currentText : 'Começo',
	    monthNames : [ 'Janeiro', 'Fevereiro', 'Março', 'Abril', 'Maio', 'Junho','Julho', 'Agosto', 'Setembro', 'Outubro', 'Novembro', 'Dezembro' ],
	    monthNamesShort : [ 'Jan', 'Fev', 'Mar', 'Abr', 'Mai', 'Jun', 'Jul', 'Ago','Set', 'Out', 'Nov', 'Des' ],
	    dayNames : [ 'Domingo', 'Segunda', 'Terça', 'Quarta', 'Quinta', 'Sexta','Sábado' ],
	    dayNamesShort : [ 'Dom', 'Seg', 'Ter', 'Qua', 'Qui', 'Sex', 'Sáb' ],
	    dayNamesMin : [ 'D', 'S', 'T', 'Q', 'Q', 'S', 'S' ],
	    weekHeader : 'Semana',
	    firstDay : 1,
	    isRTL : false,
	    showMonthAfterYear : false,
	    yearSuffix : '',
	    timeOnlyTitle : 'Só Horas',
	    timeText : 'Tempo',
	    hourText : 'Hora',
	    minuteText : 'Minuto',
	    secondText : 'Segundo',
	    ampm : false,
	    month : 'Mês',
	    week : 'Semana',
	    day : 'Dia',
	    allDayText : 'Todo Dia'
	};

jQuery(document).ready(function(jQuery) {  
    // Chamada da funcao upperText(); ao carregar a pagina  
    upperText();  
});  
// Funcao que faz o texto ficar em uppercase  
function upperText() {  
    // Para tratar o colar  
    jQuery(".up").bind('paste', function(e) {  
        var el = jQuery(this);  
        setTimeout(function() {  
            var text = jQuery(el).val();  
            el.val(text.toUpperCase());  
        }, 100);  
    });  
  
    // Para tratar quando é digitado  
    jQuery(".up").keypress(function() {  
        var el = jQuery(this);  
        setTimeout(function() {  
            var text = jQuery(el).val();  
            el.val(text.toUpperCase());  
        }, 100);  
    });  
}  