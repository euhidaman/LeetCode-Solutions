# Search in a matrix
## Easy 
<div class="problem-statement">
                <p><a onclick="gtagHelperFunction('clickopen','salesevent_gsc_problemspage_promobanner')" href="https://practice.geeksforgeeks.org/summer-carnival-2022?utm_source=practiceproblems&amp;utm_medium=problemspromobanner&amp;utm_campaign=gsc22" target="_blank"></a></p><div style="margin: 14px 0px !important;" class="row"><a onclick="gtagHelperFunction('clickopen','salesevent_gsc_problemspage_promobanner')" href="https://practice.geeksforgeeks.org/summer-carnival-2022?utm_source=practiceproblems&amp;utm_medium=problemspromobanner&amp;utm_campaign=gsc22" target="_blank">             <div class="col-md-12" style="cursor:pointer;background: #EFF8F3 0% 0% no-repeat padding-box; display: flex; align-items: center; position:                 relative; padding: 1.5%; border-radius: 10px; display: inline-block; text-align: center; font-weight: 600; color: #333"> <img src="https://media.geeksforgeeks.org/img-practice/gcs2022thumbnail-1649059370.png" alt="Lamp" width="46" height="40" style="background: transparent 0% 0% no-repeat padding-box;opacity: 1; margin: 0 16px;" class="img-responsive"> Geeks Summer Carnival is LIVE NOW &nbsp; <i class="fa fa-external-link" aria-hidden="true"></i> </div></a></div><p><span style="font-size:18px">Given a matrix <strong>mat</strong>[][] of size <strong>N</strong>&nbsp;x&nbsp;<strong>M</strong>, where every row and column is sorted in increasing order, and a number <strong>X</strong> is given. The task is to find whether element <strong>X</strong> is present in the matrix or not.</span></p>

<p><br>
<span style="font-size:18px"><strong>Example 1:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input</strong>:
N = 3, M = 3
mat[][] = 3 30 38 
         44 52 54 
         57 60 69
X = 62
<strong>Output</strong>:
0
<strong>Explanation</strong>:
62 is not present in the
matrix, so output is 0</span></pre>

<p><br>
<span style="font-size:18px"><strong>Example 2:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input</strong>:
N = 1, M = 6
mat[][]<strong> </strong>= 18 21 27 38 55 67
X = 55
<strong>Output</strong>:
1
<strong>Explanation</strong>:
55 is present in the
matrix at 5th cell.</span></pre>

<p><br>
<span style="font-size:18px"><strong>Your Task:</strong><br>
You don't need to read input or print anything. You just have to complete the function&nbsp;matSearch()&nbsp;which takes a 2D matrix&nbsp;<strong>mat</strong>[][],&nbsp;its dimensions <strong>N</strong> and <strong>M</strong> and integer <strong>X</strong> as inputs and returns 1 if the element <strong>X</strong> is present in the matrix and 0 otherwise.</span></p>

<p><br>
<span style="font-size:18px"><strong>Expected Time Complexity</strong>:&nbsp;O(N+M).<br>
<strong>Expected Auxiliary Space</strong>:&nbsp;O(1).</span></p>

<p><br>
<span style="font-size:18px"><strong>Constraints</strong>:<br>
1 &lt;= N, M &lt;= 1005<br>
1 &lt;= mat[][] &lt;= 10000000<br>
1&lt;= X &lt;= 10000000</span></p>
 <p></p>
            </div>