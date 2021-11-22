func reverseString(s []byte) {
	var holder byte
	for i := 0; i < len(s)/2; i++ {
		holder = s[i]
		s[i] = s[len(s)-i-1]
		s[len(s)-i-1] = holder
	}
}