function startTime() {
    $.get('/fnote/quote/random',function(data, status) {
	//alert("data:" + data + "\n status:" + status)
	$("#randQuote").text(data);
	t = setTimeout(function() {startTime()}, 5000)
    });
}
startTime()
