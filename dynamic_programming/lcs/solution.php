<?php

// $x = [1, 2, 3, 4, 1];
// $y = [3, 4, 1, 2, 1, 3];

// $x = str_split("HUMAN", 1);
// $y = str_split("CHIMPANZEE", 1);

$handle = fopen ("php://stdin", "r");

function head(array $a) {
    return $a[0];
}

function tail(array $b) {
    return array_splice($b, 1);
}

function lcs($a, $b) {
        if (!empty($a) && !empty($b)) {
        list($ha,$ta) = [head($a), tail($a)];
        list($hb,$tb) = [head($b), tail($b)];
        if ($a[0] == $b[0]) {
            return array_merge(lcs($ta, $tb), [$ha]);
        } else {
            return max(lcs($a, $tb), lcs($b, $ta));
        }
    } else {
        return [];
    }
}

fscanf($handle, "%i %i", $n, $m);

$a = array_map('intval', explode(" ", fgets($handle)));
$b = array_map('intval', explode(" ", fgets($handle)));

$result = lcs($a, $b);
asort($result);
echo implode(" ", $result)."\n";
