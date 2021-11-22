class Solution
{
public:
    bool isValid(string s)
    {
        stack<char> stack;

        //iterate over string
        for (char &c : s)
        {
            //check if char is start of set
            if (c == '{' || c == '(' || c == '[')
            {
                stack.push(c);
            }
            //otherwise char is closing set
            else
            {
                //check if stack is empty, or that the closing set is not correct
                if (stack.empty() || stack.top() != char(c - 1) && stack.top() != char(c - 2))
                {
                    return false;
                }
                //pop the open part of the completed set off the stack
                else
                {
                    stack.pop();
                }
            }
        }
        //if the stack is not empty then it is not correct
        return stack.empty();
    }
};