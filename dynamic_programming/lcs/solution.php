<?php

// $x = [1, 2, 3, 4, 1];
// $y = [3, 4, 1, 2, 1, 3];

// $x = str_split("HUMAN", 1);
// $y = str_split("CHIMPANZEE", 1);

$handle = fopen ("php://stdin", "r");

function head(array $x) {
    return array_splice($x, 0, sizeof($x)-1);
}

function tail(array $y) {
    return $y[sizeof($y)-1];
}

function lcs($a, $b) {
    if ($a && $b) {
        list($ha,$ta) = [head($a), tail($a)];
        list($hb,$tb) = [head($b), tail($b)];
        if ($ta === $tb) {
            return array_merge(lcs($ha, $hb), [$ta]);
        } else {
            list($temp1, $temp2) = [lcs($a, $hb), lcs($b, $ha)];
            list($len1, $len2) = [count($temp1), count($temp2)];
            return $len1 > $len2 ? $temp1 : $temp2;
        }
    } else {
        return [];
    }
}

fscanf($handle, "%i %i", $n, $m);

$a = array_map('intval', explode(" ", fgets($handle)));
$b = array_map('intval', explode(" ", fgets($handle)));

$result = lcs($a, $b);
// asort($result);
echo implode(" ", $result)."\n";
