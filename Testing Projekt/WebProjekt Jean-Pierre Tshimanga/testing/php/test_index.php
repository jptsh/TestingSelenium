<!DOCTYPE html>
<html>
<title>Testing Website</title>
<link rel="stylesheet" type="text/css" href="testing_style.css" />
<head>
</head>
<body>

	<div class="w3-container w3-light-grey">

		<header class="w3-container w3-teal w3-section w3-round-large"
			style="text-align: center">
			<h1>Test-Webseite</h1>
		</header>
		<div class="w3-bar w3-black w3-round-large">
			<a href="./test_index.html" class="w3-bar-item w3-hover-green">Zur&uuml;ck</a>
		</div>
		<div class="center w3-round-large">
			<article class="w3-container">
				<h1>Das Ergebnis!</h1>
			<?php
$vorname = $_POST['vorname']; // Holen der Variable Vorname
$nachname = $_POST['nachname']; // Holen der Variable Nachname
if (ctype_alpha($vorname) && ctype_alpha($nachname)) { // Vergleich, ob beide Variablen alphabetisch sind
    if (strlen($vorname) > 10 || strlen($nachname) > 10) { // Strlen für beide variablen überprüfen auf größer 10
        echo ("Die Namen d&uuml;rfen maximal 10 zeichen lang sein!<br />");
    } else {
        echo "Hallo, " . $vorname . " " . $nachname . "!" . "<br />";
    }
} else {
    echo ("Die Namen sind nicht alphabetisch gesetzt!<br />");
}
echo ("<a href=\"test_index.html\">Zur&uuml;ck zur Webseite</a>");
?>							
		</article>
		</div>

		<footer class="w3-container w3-teal w3-round-large"> @ Eine einfache
			Website mit dem W3.css framework by Jean-Pierre </footer>

	</div>

</body>
</html>






