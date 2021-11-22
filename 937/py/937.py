class Solution:
    def reorderLogFiles(self, logs: List[str]) -> List[str]:

        let = []
        dig = []
        for log in logs:
            a = log.split(" ")
            print(a[1 : len(a)])
            if a[1].isdigit():
                dig.append(log)
            else:
                let.append(log)

        # print(let)
        # print(dig)

        let.sort(key=lambda log: (log.split()[1:], log.split()[0]))

        return let + dig
