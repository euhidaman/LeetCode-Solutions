# Transpose of Matrix
## Easy
<div class="problem-statement">
                <p><a onclick="gtagHelperFunction('clickopen','salesevent_gsc_problemspage_promobanner')" href="https://practice.geeksforgeeks.org/summer-carnival-2022?utm_source=practiceproblems&amp;utm_medium=problemspromobanner&amp;utm_campaign=gsc22" target="_blank"></a></p><div style="margin: 14px 0px !important;" class="row"><a onclick="gtagHelperFunction('clickopen','salesevent_gsc_problemspage_promobanner')" href="https://practice.geeksforgeeks.org/summer-carnival-2022?utm_source=practiceproblems&amp;utm_medium=problemspromobanner&amp;utm_campaign=gsc22" target="_blank">             <div class="col-md-12" style="cursor:pointer;background: #EFF8F3 0% 0% no-repeat padding-box; display: flex; align-items: center; position:                 relative; padding: 1.5%; border-radius: 10px; display: inline-block; text-align: center; font-weight: 600; color: #333"> <img src="https://media.geeksforgeeks.org/img-practice/gcs2022thumbnail-1649059370.png" alt="Lamp" width="46" height="40" style="background: transparent 0% 0% no-repeat padding-box;opacity: 1; margin: 0 16px;" class="img-responsive"> Geeks Summer Carnival is LIVE NOW &nbsp; <i class="fa fa-external-link" aria-hidden="true"></i> </div></a></div><p><span style="font-size:18px">Write a program to find the transpose of a square matrix&nbsp;of size N*N. Transpose of a matrix is obtained by changing rows to columns and columns to rows.</span><br>
<br>
<span style="font-size:18px"><strong>Example 1:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input</strong>:
N = 4
mat[][] = {{1, 1, 1, 1},
&nbsp;          {2, 2, 2, 2}
&nbsp;          {3, 3, 3, 3}
&nbsp;          {4, 4, 4, 4}}
<strong>Output</strong>: 
{{1, 2, 3, 4}, &nbsp;
&nbsp;{1, 2, 3, 4} &nbsp;
&nbsp;{1, 2, 3, 4}
&nbsp;{1, 2, 3, 4}} </span>
</pre>

<p><span style="font-size:18px"><strong>Example 2:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input</strong>:
N = 2
mat[][] = {{1, 2},
&nbsp;          {-9, -2}}
<strong>Output</strong>:
{{1, -9}, 
&nbsp;{2, -2}}
</span>
</pre>

<p><span style="font-size:18px"><strong>Your Task:</strong></span><br>
<span style="font-size:18px">You dont need to read input or print anything.&nbsp;</span><span style="font-size:18px">Complete the function <strong>transpose</strong>() which takes matrix[][] and N as input parameter and&nbsp;finds the transpose of the input matrix. You need to do this in-place. That is you need to update the original matrix with the transpose.&nbsp;<br>
<br>
<strong>Expected Time Complexity:</strong> O(N * N)<br>
<strong>Expected Auxiliary Space:</strong> O(1)<br>
<br>
<strong>Constraints:</strong><br>
1 &lt;= N &lt;= 100<br>
-10<sup>3</sup> &lt;= mat[i][j] &lt;= 10<sup>3</sup></span></p>
 <p></p>
            </div>