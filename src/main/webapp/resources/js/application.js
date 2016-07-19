

function initDescOrderStyle() {
	var list = $('.closeable');

	for ( var i = 0, il = list.length; i < il; i++) {
		var closeable = $(list[i]);
		closeable.next('ul').hide();
		closeable.addClass('sortDown');
		closeable.bind('mouseover', function() {
			$(this).addClass('cursor');
		});
		closeable.bind('click', function() {
			var closeable = $(this);
			toggle(closeable);

			var l = closeable.next('ul');

			if (l.length == 0)
				l = closeable.next('ol');

			var list2 = l.find('.closeable');
			for ( var j = list2.length - 1; j >= 0; j--) {
				toggle($(list2[j]));
			}
		});
	}
}

function toggle(closeable) {
	closeable.next('ul').toggle('fast');
	closeable.toggleClass('sortDown');
	closeable.toggleClass('sortUp');
}

!function($) {
	$(function() {
	    var $window = $(window);

		initDescOrderStyle();
// As linhas abaixo foram comentadas porque da pau no final da pagina.
		/*setTimeout(function() {
			$('.nav-list').affix({
				offset : {
					top : function() {
						return $window.width() <= 980 ? 80 : 60;
					},
					bottom : 270
				}
			});
		}, 100);*/
	});
}(window.jQuery);

// https://gist.github.com/edmundojr/2228169
// Corrigir placeholder no IE7+
$('[placeholder]').focus(function() {
	var input = $(this);
	if (input.val() == input.attr('placeholder')) {
		input.val('');
		input.removeClass('placeholder');
	}
}).blur(function() {
	var input = $(this);
	if (input.val() == '' || input.val() == input.attr('placeholder')) {
		input.addClass('placeholder');
		input.val(input.attr('placeholder'));
	}
}).blur().parents('form').submit(function() {
	$(this).find('[placeholder]').each(function() {
		var input = $(this);
		if (input.val() == input.attr('placeholder')) {
			input.val('');
		}
	});
});